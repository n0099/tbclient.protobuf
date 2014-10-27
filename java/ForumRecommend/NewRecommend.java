package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class NewRecommend extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer member_count;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;

    /* synthetic */ NewRecommend(Builder builder, boolean z, NewRecommend newRecommend) {
        this(builder, z);
    }

    private NewRecommend(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = builder.member_count;
            }
            if (builder.avatar == null) {
                this.avatar = "";
                return;
            } else {
                this.avatar = builder.avatar;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.member_count = builder.member_count;
        this.avatar = builder.avatar;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<NewRecommend> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer member_count;

        public Builder(NewRecommend newRecommend) {
            super(newRecommend);
            if (newRecommend != null) {
                this.forum_id = newRecommend.forum_id;
                this.forum_name = newRecommend.forum_name;
                this.member_count = newRecommend.member_count;
                this.avatar = newRecommend.avatar;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewRecommend build(boolean z) {
            return new NewRecommend(this, z, null);
        }
    }
}
