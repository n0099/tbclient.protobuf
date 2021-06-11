package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class FollowRelation extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.BOOL)
    public final Boolean has_follow;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Boolean DEFAULT_HAS_FOLLOW = Boolean.FALSE;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<FollowRelation> {
        public Boolean has_follow;
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(FollowRelation followRelation) {
            super(followRelation);
            if (followRelation == null) {
                return;
            }
            this.user_id = followRelation.user_id;
            this.user_name = followRelation.user_name;
            this.portrait = followRelation.portrait;
            this.has_follow = followRelation.has_follow;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FollowRelation build(boolean z) {
            return new FollowRelation(this, z);
        }
    }

    public FollowRelation(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Boolean bool = builder.has_follow;
            if (bool == null) {
                this.has_follow = DEFAULT_HAS_FOLLOW;
                return;
            } else {
                this.has_follow = bool;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.has_follow = builder.has_follow;
    }
}
