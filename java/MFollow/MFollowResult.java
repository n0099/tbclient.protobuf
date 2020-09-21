package tbclient.MFollow;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes23.dex */
public final class MFollowResult extends Message {
    public static final Boolean DEFAULT_IS_SUCCESS = false;
    public static final String DEFAULT_MSG = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 2, type = Message.Datatype.BOOL)
    public final Boolean is_success;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String msg;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;

    private MFollowResult(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.is_success == null) {
                this.is_success = DEFAULT_IS_SUCCESS;
            } else {
                this.is_success = builder.is_success;
            }
            if (builder.msg == null) {
                this.msg = "";
                return;
            } else {
                this.msg = builder.msg;
                return;
            }
        }
        this.portrait = builder.portrait;
        this.is_success = builder.is_success;
        this.msg = builder.msg;
    }

    /* loaded from: classes23.dex */
    public static final class Builder extends Message.Builder<MFollowResult> {
        public Boolean is_success;
        public String msg;
        public String portrait;

        public Builder() {
        }

        public Builder(MFollowResult mFollowResult) {
            super(mFollowResult);
            if (mFollowResult != null) {
                this.portrait = mFollowResult.portrait;
                this.is_success = mFollowResult.is_success;
                this.msg = mFollowResult.msg;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MFollowResult build(boolean z) {
            return new MFollowResult(this, z);
        }
    }
}
