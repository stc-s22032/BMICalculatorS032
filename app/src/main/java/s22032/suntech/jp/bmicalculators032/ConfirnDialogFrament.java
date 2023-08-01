package s22032.suntech.jp.bmicalculators032;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
//import androidx.appcompat.app.AlertDialog;
import androidx.annotation.Nullable;

public class ConfirnDialogFrament extends DialogFragment {
    @NonNull
    //@Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
        AlertDialog.Builder builder =new AlertDialog.Builder(getActivity());
        builder.setTitle("警告");
        builder.setMessage("適切な肥満度を求めるためには、6歳未満の場合はカウプ指数が、6歳から15際まではローレル指数が使われています。本アプリはBMIのみに対応しております。");
        builder.setPositiveButton("確認",new DialogButtonClickListener());

        AlertDialog dialog = builder.create();
        return dialog;

    }
    private class DialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog,int which){

        }
    }
}
