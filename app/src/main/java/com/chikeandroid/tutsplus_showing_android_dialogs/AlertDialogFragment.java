package com.chikeandroid.tutsplus_showing_android_dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by Chike on 11/28/2017.
 */
public class AlertDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        return (builder.setTitle("Activate superpowers?").setMessage("By activating superpowers, you'll have more powers to save the world.")
                       .setPositiveButton("Activate", this)
                       .setNegativeButton("Cancel", this)
                       .create());
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        Toast.makeText(getActivity(), "which is " + which, Toast.LENGTH_LONG).show();
    }
}