package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DelThreadText extends Message {
    public static final Integer DEFAULT_TEXT_ID = 0;
    public static final String DEFAULT_TEXT_INFO = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer text_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text_info;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DelThreadText> {
        public Integer text_id;
        public String text_info;

        public Builder() {
        }

        public Builder(DelThreadText delThreadText) {
            super(delThreadText);
            if (delThreadText == null) {
                return;
            }
            this.text_id = delThreadText.text_id;
            this.text_info = delThreadText.text_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DelThreadText build(boolean z) {
            return new DelThreadText(this, z);
        }
    }

    public DelThreadText(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.text_id;
            if (num == null) {
                this.text_id = DEFAULT_TEXT_ID;
            } else {
                this.text_id = num;
            }
            String str = builder.text_info;
            if (str == null) {
                this.text_info = "";
                return;
            } else {
                this.text_info = str;
                return;
            }
        }
        this.text_id = builder.text_id;
        this.text_info = builder.text_info;
    }
}
