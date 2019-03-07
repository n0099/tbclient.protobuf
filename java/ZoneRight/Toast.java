package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class Toast extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;

    private Toast(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.content == null) {
                this.content = "";
                return;
            } else {
                this.content = builder.content;
                return;
            }
        }
        this.type = builder.type;
        this.content = builder.content;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<Toast> {
        public String content;
        public Integer type;

        public Builder() {
        }

        public Builder(Toast toast) {
            super(toast);
            if (toast != null) {
                this.type = toast.type;
                this.content = toast.content;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Toast build(boolean z) {
            return new Toast(this, z);
        }
    }
}
