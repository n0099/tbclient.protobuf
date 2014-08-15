package tbclient.LogTogether;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class LogTogetherReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ LogTogetherReqIdl(Builder builder, boolean z, LogTogetherReqIdl logTogetherReqIdl) {
        this(builder, z);
    }

    private LogTogetherReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<LogTogetherReqIdl> {
        public DataReq data;

        public Builder(LogTogetherReqIdl logTogetherReqIdl) {
            super(logTogetherReqIdl);
            if (logTogetherReqIdl != null) {
                this.data = logTogetherReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LogTogetherReqIdl build(boolean z) {
            return new LogTogetherReqIdl(this, z, null);
        }
    }
}
