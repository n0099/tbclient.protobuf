package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Global extends Message {
    public static final String DEFAULT_TBMALL_NEWPROPS = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tbmall_newprops;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Global> {
        public String tbmall_newprops;

        public Builder() {
        }

        public Builder(Global global) {
            super(global);
            if (global == null) {
                return;
            }
            this.tbmall_newprops = global.tbmall_newprops;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Global build(boolean z) {
            return new Global(this, z);
        }
    }

    public Global(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tbmall_newprops;
            if (str == null) {
                this.tbmall_newprops = "";
                return;
            } else {
                this.tbmall_newprops = str;
                return;
            }
        }
        this.tbmall_newprops = builder.tbmall_newprops;
    }
}
