package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ResData extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forumId;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long postState;
    public static final Long DEFAULT_POSTSTATE = 0L;
    public static final Long DEFAULT_FORUMID = 0L;

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
                return;
            } else {
                this.forumId = builder.forumId;
                return;
            }
        }
        this.postState = builder.postState;
        this.forumId = builder.forumId;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ResData> {
        public Long forumId;
        public Long postState;

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.postState = resData.postState;
                this.forumId = resData.forumId;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z, null);
        }
    }
}
