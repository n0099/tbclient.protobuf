package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class HotForumItem extends Message {
    public static final String DEFAULT_FORUM_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_liked;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIKED = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<HotForumItem> {
        public String forum_avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_liked;

        public Builder() {
        }

        public Builder(HotForumItem hotForumItem) {
            super(hotForumItem);
            if (hotForumItem == null) {
                return;
            }
            this.forum_id = hotForumItem.forum_id;
            this.forum_name = hotForumItem.forum_name;
            this.forum_avatar = hotForumItem.forum_avatar;
            this.is_liked = hotForumItem.is_liked;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotForumItem build(boolean z) {
            return new HotForumItem(this, z);
        }
    }

    public HotForumItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.forum_avatar;
            if (str2 == null) {
                this.forum_avatar = "";
            } else {
                this.forum_avatar = str2;
            }
            Integer num = builder.is_liked;
            if (num == null) {
                this.is_liked = DEFAULT_IS_LIKED;
                return;
            } else {
                this.is_liked = num;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.forum_avatar = builder.forum_avatar;
        this.is_liked = builder.is_liked;
    }
}
