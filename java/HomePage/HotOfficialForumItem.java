package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HotOfficialForumItem extends Message {
    public static final String DEFAULT_FORUM_AVATOR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_avator;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_liked;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_official;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_show_vicon;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long liked_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long post_num;
    @ProtoField(tag = 9)
    public final HotOfficialThread recommend_thread;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_LIKED_NUM = 0L;
    public static final Long DEFAULT_POST_NUM = 0L;
    public static final Integer DEFAULT_IS_LIKED = 0;
    public static final Integer DEFAULT_IS_OFFICIAL = 0;
    public static final Integer DEFAULT_IS_SHOW_VICON = 0;

    /* synthetic */ HotOfficialForumItem(Builder builder, boolean z, HotOfficialForumItem hotOfficialForumItem) {
        this(builder, z);
    }

    private HotOfficialForumItem(Builder builder, boolean z) {
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
            if (builder.forum_avator == null) {
                this.forum_avator = "";
            } else {
                this.forum_avator = builder.forum_avator;
            }
            if (builder.liked_num == null) {
                this.liked_num = DEFAULT_LIKED_NUM;
            } else {
                this.liked_num = builder.liked_num;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.is_liked == null) {
                this.is_liked = DEFAULT_IS_LIKED;
            } else {
                this.is_liked = builder.is_liked;
            }
            if (builder.is_official == null) {
                this.is_official = DEFAULT_IS_OFFICIAL;
            } else {
                this.is_official = builder.is_official;
            }
            if (builder.is_show_vicon == null) {
                this.is_show_vicon = DEFAULT_IS_SHOW_VICON;
            } else {
                this.is_show_vicon = builder.is_show_vicon;
            }
            this.recommend_thread = builder.recommend_thread;
            return;
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.forum_avator = builder.forum_avator;
        this.liked_num = builder.liked_num;
        this.post_num = builder.post_num;
        this.is_liked = builder.is_liked;
        this.is_official = builder.is_official;
        this.is_show_vicon = builder.is_show_vicon;
        this.recommend_thread = builder.recommend_thread;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HotOfficialForumItem> {
        public String forum_avator;
        public Long forum_id;
        public String forum_name;
        public Integer is_liked;
        public Integer is_official;
        public Integer is_show_vicon;
        public Long liked_num;
        public Long post_num;
        public HotOfficialThread recommend_thread;

        public Builder() {
        }

        public Builder(HotOfficialForumItem hotOfficialForumItem) {
            super(hotOfficialForumItem);
            if (hotOfficialForumItem != null) {
                this.forum_id = hotOfficialForumItem.forum_id;
                this.forum_name = hotOfficialForumItem.forum_name;
                this.forum_avator = hotOfficialForumItem.forum_avator;
                this.liked_num = hotOfficialForumItem.liked_num;
                this.post_num = hotOfficialForumItem.post_num;
                this.is_liked = hotOfficialForumItem.is_liked;
                this.is_official = hotOfficialForumItem.is_official;
                this.is_show_vicon = hotOfficialForumItem.is_show_vicon;
                this.recommend_thread = hotOfficialForumItem.recommend_thread;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotOfficialForumItem build(boolean z) {
            return new HotOfficialForumItem(this, z, null);
        }
    }
}
