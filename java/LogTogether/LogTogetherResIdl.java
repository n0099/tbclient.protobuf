package tbclient.LogTogether;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class LogTogetherResIdl extends Message {
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LogTogetherResIdl> {
        public Error error;

        public Builder() {
        }

        public Builder(LogTogetherResIdl logTogetherResIdl) {
            super(logTogetherResIdl);
            if (logTogetherResIdl == null) {
                return;
            }
            this.error = logTogetherResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LogTogetherResIdl build(boolean z) {
            return new LogTogetherResIdl(this, z);
        }
    }

    public LogTogetherResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
        } else {
            this.error = builder.error;
        }
    }
}
