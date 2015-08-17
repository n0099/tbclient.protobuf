package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ResData extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forumId;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long postState;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long quoteId;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long repostId;
    public static final Long DEFAULT_POSTSTATE = 0L;
    public static final Long DEFAULT_FORUMID = 0L;
    public static final Long DEFAULT_QUOTEID = 0L;
    public static final Long DEFAULT_REPOSTID = 0L;

    /* synthetic */ ResData(Builder builder, boolean z, ResData resData) {
        this(builder, z);
    }

    private ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.postState == null) {
                this.postState = DEFAULT_POSTSTATE;
            } else {
                this.postState = builder.postState;
            }
            if (builder.forumId == null) {
                this.forumId = DEFAULT_FORUMID;
            } else {
                this.forumId = builder.forumId;
            }
            if (builder.quoteId == null) {
                this.quoteId = DEFAULT_QUOTEID;
            } else {
                this.quoteId = builder.quoteId;
            }
            if (builder.repostId == null) {
                this.repostId = DEFAULT_REPOSTID;
                return;
            } else {
                this.repostId = builder.repostId;
                return;
            }
        }
        this.postState = builder.postState;
        this.forumId = builder.forumId;
        this.quoteId = builder.quoteId;
        this.repostId = builder.repostId;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public Long forumId;
        public Long postState;
        public Long quoteId;
        public Long repostId;

        public Builder() {
        }

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.postState = resData.postState;
                this.forumId = resData.forumId;
                this.quoteId = resData.quoteId;
                this.repostId = resData.repostId;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z, null);
        }
    }
}
