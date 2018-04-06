package mx.nakva.dialogcreator

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface


/**
 * Created by Juancho on 06/04/18.
 * Nakva
 * juan.hernandez@nakva.mx
 */
object DialogCreator {

    /**
     *
     * Display an alert in the current context
     *
     * - This dialog can be use as confirmation dialog
     *
     * @param context                       Current context to show the alert
     * @param titleId                       Title of the alert
     * @param messageId                     Message to show in the alert
     * @param positiveBtnTextId             Id of the string to set in the positive button
     * @param onCLickPositiveBtnListener    Callback listener for the onclick event in the positive btn
     * @param showBtnNegative               Flag to show the negative btn
     * @param negativeBtnTextId             Id of the string resource to set the negative btn
     * @param onCLickNegativeBtnListener    Callback listener for the onclick event in the negative btn
     * @param onDismissListener             Callback listener for the on dismiss event in the dialog
     * @param iconId                Id of the drawable to show as icon
     */
    fun showDialogMessage(context: Context,
                          titleId: Int,
                          messageId: Int,
                          positiveBtnTextId: Int? = null,
                          onCLickPositiveBtnListener: DialogInterface.OnClickListener? = null,
                          showBtnNegative: Boolean? = null,
                          negativeBtnTextId: Int? = null,
                          onCLickNegativeBtnListener: DialogInterface.OnClickListener? = null,
                          onDismissListener: DialogInterface.OnDismissListener? = null,
                          iconId: Int? = null) {

    }

    /**
     *
     * Display an alert in the current context
     *
     * - This dialog can be use as confirmation dialog
     *
     * @param context                       Current context to show the alert
     * @param titleId                       Title of the alert
     * @param message                       Message to show in the alert
     * @param positiveBtnTextId             Id of the string to set in the positive button
     * @param onCLickPositiveBtnListener    Callback listener for the onclick event in the positive btn
     * @param showBtnNegative               Flag to show the negative btn
     * @param negativeBtnTextId             Id of the string resource to set the negative btn
     * @param onCLickNegativeBtnListener    Callback listener for the onclick event in the negative btn
     * @param onDismissListener             Callback listener for the on dismiss event in the dialog
     * @param iconId                Id of the drawable to show as icon
     */
    fun showDialogMessage(context: Context,
                          titleId: Int,
                          message: String,
                          positiveBtnTextId: Int? = null,
                          onCLickPositiveBtnListener: DialogInterface.OnClickListener? = null,
                          showBtnNegative: Boolean? = null,
                          negativeBtnTextId: Int? = null,
                          onCLickNegativeBtnListener: DialogInterface.OnClickListener? = null,
                          onDismissListener: DialogInterface.OnDismissListener? = null,
                          iconId: Int? = null) {

        val btnPositiveId = positiveBtnTextId ?: android.R.string.ok
        val btnNegativeId = negativeBtnTextId ?: android.R.string.cancel
        val showNegativeBtn = showBtnNegative ?: false

        val builder = AlertDialog.Builder(context)
        if(iconId != null) {
            builder.setIcon(iconId)
        }
        builder.setTitle(titleId)
        builder.setMessage(message)
        builder.setPositiveButton(btnPositiveId, onCLickPositiveBtnListener)
        if (showNegativeBtn) {
            builder.setNegativeButton(btnNegativeId, onCLickNegativeBtnListener)
        }
        val alert = builder.create()
        alert.setOnDismissListener(onDismissListener)
        alert.show()
    }

    /**
     * Show a dialog with an error title and the error android icon
     * @param context           Current context to show the alert dialog
     * @param messageId         Message to show in the Error Dialog
     * @param onDismissListener Callback listener for the on Dismiss event of the Dialog
     */
    fun showError(context: Context,
                  messageId: Int,
                  onDismissListener: DialogInterface.OnDismissListener? = null) {

        showDialogMessage(context,
                R.string._dialog_create_error,
                messageId,
                android.R.string.ok,
                null, null, null, null,
                onDismissListener, android.R.drawable.ic_delete)
    }

    /**
     * Show a dialog with an error title and the error android icon
     * @param context           Current context to show the alert dialog
     * @param message           Message to show in the Error Dialog
     * @param onDismissListener Callback listener for the on Dismiss event of the Dialog
     */
    fun showError(context: Context,
                  message: String,
                  onDismissListener: DialogInterface.OnDismissListener? = null) {

        showDialogMessage(context,
                R.string._dialog_create_error,
                message,
                android.R.string.ok,
                null, null, null, null,
                onDismissListener, android.R.drawable.ic_delete)
    }
}