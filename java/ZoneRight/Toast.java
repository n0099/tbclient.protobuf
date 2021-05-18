package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class Toast extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Toast> {
        public String content;
        public Integer type;

        public Builder() {
        }

        public Builder(Toast toast) {
            super(toast);
            if (toast == null) {
                return;
            }
            this.type = toast.type;
            this.content = toast.content;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Toast build(boolean z) {
            return new Toast(this, z);
        }
    }

    public Toast(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.content;
            if (str == null) {
                this.content = "";
                return;
            } else {
                this.content = str;
                return;
            }
        }
        this.type = builder.type;
        this.content = builder.content;
    }
}
