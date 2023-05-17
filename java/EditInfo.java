package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class EditInfo extends Message {
    public static final String DEFAULT_EDIT_ERROR_MSG = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer edit_enable;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String edit_error_msg;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer edit_error_no;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer edit_from;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer edit_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer last_edit_time;
    public static final Integer DEFAULT_EDIT_STATUS = 0;
    public static final Integer DEFAULT_EDIT_ENABLE = 0;
    public static final Integer DEFAULT_LAST_EDIT_TIME = 0;
    public static final Integer DEFAULT_EDIT_FROM = 0;
    public static final Integer DEFAULT_EDIT_ERROR_NO = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<EditInfo> {
        public Integer edit_enable;
        public String edit_error_msg;
        public Integer edit_error_no;
        public Integer edit_from;
        public Integer edit_status;
        public Integer last_edit_time;

        public Builder() {
        }

        public Builder(EditInfo editInfo) {
            super(editInfo);
            if (editInfo == null) {
                return;
            }
            this.edit_status = editInfo.edit_status;
            this.edit_enable = editInfo.edit_enable;
            this.edit_error_msg = editInfo.edit_error_msg;
            this.last_edit_time = editInfo.last_edit_time;
            this.edit_from = editInfo.edit_from;
            this.edit_error_no = editInfo.edit_error_no;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EditInfo build(boolean z) {
            return new EditInfo(this, z);
        }
    }

    public EditInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.edit_status;
            if (num == null) {
                this.edit_status = DEFAULT_EDIT_STATUS;
            } else {
                this.edit_status = num;
            }
            Integer num2 = builder.edit_enable;
            if (num2 == null) {
                this.edit_enable = DEFAULT_EDIT_ENABLE;
            } else {
                this.edit_enable = num2;
            }
            String str = builder.edit_error_msg;
            if (str == null) {
                this.edit_error_msg = "";
            } else {
                this.edit_error_msg = str;
            }
            Integer num3 = builder.last_edit_time;
            if (num3 == null) {
                this.last_edit_time = DEFAULT_LAST_EDIT_TIME;
            } else {
                this.last_edit_time = num3;
            }
            Integer num4 = builder.edit_from;
            if (num4 == null) {
                this.edit_from = DEFAULT_EDIT_FROM;
            } else {
                this.edit_from = num4;
            }
            Integer num5 = builder.edit_error_no;
            if (num5 == null) {
                this.edit_error_no = DEFAULT_EDIT_ERROR_NO;
                return;
            } else {
                this.edit_error_no = num5;
                return;
            }
        }
        this.edit_status = builder.edit_status;
        this.edit_enable = builder.edit_enable;
        this.edit_error_msg = builder.edit_error_msg;
        this.last_edit_time = builder.last_edit_time;
        this.edit_from = builder.edit_from;
        this.edit_error_no = builder.edit_error_no;
    }
}
