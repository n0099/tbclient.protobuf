package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class EditConfig extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_first_edit;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer show_edit;
    public static final Integer DEFAULT_SHOW_EDIT = 0;
    public static final Integer DEFAULT_IS_FIRST_EDIT = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<EditConfig> {
        public Integer is_first_edit;
        public Integer show_edit;

        public Builder() {
        }

        public Builder(EditConfig editConfig) {
            super(editConfig);
            if (editConfig == null) {
                return;
            }
            this.show_edit = editConfig.show_edit;
            this.is_first_edit = editConfig.is_first_edit;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EditConfig build(boolean z) {
            return new EditConfig(this, z);
        }
    }

    public EditConfig(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.show_edit;
            if (num == null) {
                this.show_edit = DEFAULT_SHOW_EDIT;
            } else {
                this.show_edit = num;
            }
            Integer num2 = builder.is_first_edit;
            if (num2 == null) {
                this.is_first_edit = DEFAULT_IS_FIRST_EDIT;
                return;
            } else {
                this.is_first_edit = num2;
                return;
            }
        }
        this.show_edit = builder.show_edit;
        this.is_first_edit = builder.is_first_edit;
    }
}
