package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class RetDataList extends Message {
    public static final Integer DEFAULT_NEED_DIALOG = 0;
    @ProtoField(tag = 1)
    public final DialogItem dialog;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_dialog;
    @ProtoField(tag = 2)
    public final TaskInfoItem task_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RetDataList> {
        public DialogItem dialog;
        public Integer need_dialog;
        public TaskInfoItem task_info;

        public Builder() {
        }

        public Builder(RetDataList retDataList) {
            super(retDataList);
            if (retDataList == null) {
                return;
            }
            this.dialog = retDataList.dialog;
            this.task_info = retDataList.task_info;
            this.need_dialog = retDataList.need_dialog;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RetDataList build(boolean z) {
            return new RetDataList(this, z);
        }
    }

    public RetDataList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.dialog = builder.dialog;
            this.task_info = builder.task_info;
            Integer num = builder.need_dialog;
            if (num == null) {
                this.need_dialog = DEFAULT_NEED_DIALOG;
                return;
            } else {
                this.need_dialog = num;
                return;
            }
        }
        this.dialog = builder.dialog;
        this.task_info = builder.task_info;
        this.need_dialog = builder.need_dialog;
    }
}
