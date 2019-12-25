package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class PkModule extends Message {
    public static final Long DEFAULT_PK_ID = 0L;
    public static final Long DEFAULT_USER_PK_ID = 0L;
    @ProtoField(tag = 3)
    public final PkItem agree;
    @ProtoField(tag = 4)
    public final PkItem disagree;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long pk_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_pk_id;

    private PkModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pk_id == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = builder.pk_id;
            }
            if (builder.user_pk_id == null) {
                this.user_pk_id = DEFAULT_USER_PK_ID;
            } else {
                this.user_pk_id = builder.user_pk_id;
            }
            this.agree = builder.agree;
            this.disagree = builder.disagree;
            return;
        }
        this.pk_id = builder.pk_id;
        this.user_pk_id = builder.user_pk_id;
        this.agree = builder.agree;
        this.disagree = builder.disagree;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<PkModule> {
        public PkItem agree;
        public PkItem disagree;
        public Long pk_id;
        public Long user_pk_id;

        public Builder() {
        }

        public Builder(PkModule pkModule) {
            super(pkModule);
            if (pkModule != null) {
                this.pk_id = pkModule.pk_id;
                this.user_pk_id = pkModule.user_pk_id;
                this.agree = pkModule.agree;
                this.disagree = pkModule.disagree;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkModule build(boolean z) {
            return new PkModule(this, z);
        }
    }
}
