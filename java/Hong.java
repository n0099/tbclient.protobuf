package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class Hong extends Message {
    public static final String DEFAULT_TEST = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String test;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Hong> {
        public String test;

        public Builder() {
        }

        public Builder(Hong hong) {
            super(hong);
            if (hong == null) {
                return;
            }
            this.test = hong.test;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Hong build(boolean z) {
            return new Hong(this, z);
        }
    }

    public Hong(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.test;
            if (str == null) {
                this.test = "";
                return;
            } else {
                this.test = str;
                return;
            }
        }
        this.test = builder.test;
    }
}
