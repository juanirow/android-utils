package mx.nakva.dialogcreator


/**
 * Created by Juancho on 06/04/18.
 * Nakva
 * linanjm90@gmail.com
 */
object DialogCreator {

    /**
     *
     * Display an alert in the current context
     *
     * - This dialog can be use as confirmation dialog
     *
     * @param context               Current context to show the alert
     * @param titleId               Title of the alert
     * @param iconId                Id of the drawable to show as icon
     * @param positiveBtnTextId     Id of the string to set in the positive button
     * @param messageId             Message to show in the alert
     * @param onCLickListener       Listener to detect the clicks in the buttons
     * @param onDismissListener     Listener to detect the dismiss action of the alert
     */
    fun showDialogMessage(context: Context,
                          titleId: Int,
                          iconId: Int? = null,
                          positiveBtnTextId: Int,
                          messageId: Int,
                          onCLickListener: DialogInterface.OnClickListener? = null,
                          onDismissListener: DialogInterface.OnDismissListener? = null) {
        val builder = AlertDialog.Builder(context)
        if(iconId != null) {
            builder.setIcon(iconId)
        }
        builder.setTitle(titleId)
        builder.setPositiveButton(positiveBtnTextId, onCLickListener)
        builder.setMessage(messageId)
        val alert = builder.create()
        alert.setOnDismissListener(onDismissListener)
        alert.show()
    }
}