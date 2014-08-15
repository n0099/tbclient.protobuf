package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CheckPostReqIdl extends Message {
    @ProtoField(tag = 1)
    public final ReqData data;

    /* synthetic */ CheckPostReqIdl(Builder builder, boolean z, CheckPostReqIdl checkPostReqIdl) {
        this(builder, z);
    }

    private CheckPostReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<CheckPostReqIdl> {
        public ReqData data;

        public Builder(CheckPostReqIdl checkPostReqIdl) {
            super(checkPostReqIdl);
            if (checkPostReqIdl != null) {
                this.data = checkPostReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CheckPostReqIdl build(boolean z) {
            return new CheckPostReqIdl(this, z, null);
        }
    }
}
