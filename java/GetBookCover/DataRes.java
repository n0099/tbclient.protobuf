package tbclient.GetBookCover;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CartoonChapterInfo;
import tbclient.CartoonUserInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_AUTHOR = "";
    public static final String DEFAULT_CARTOON_NAME = "";
    public static final String DEFAULT_COVER_IMG = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_INTRODUCTION = "";
    public static final String DEFAULT_LABEL_TEXT = "";
    public static final String DEFAULT_UPDATE_INFO = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String author;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer can_download;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cartoon_name;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer cartoon_vip;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<CartoonChapterInfo> chapter_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.INT32)
    public final List<Integer> chapters;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String cover_img;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String introduction;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer is_finish;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer is_follow;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String label_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String update_info;
    @ProtoField(tag = 16)
    public final CartoonUserInfo user_info;
    public static final Long DEFAULT_CARTOON_ID = 0L;
    public static final Integer DEFAULT_IS_FOLLOW = 0;
    public static final Integer DEFAULT_IS_FINISH = 0;
    public static final Integer DEFAULT_CAN_DOWNLOAD = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final List<Integer> DEFAULT_CHAPTERS = Collections.emptyList();
    public static final List<CartoonChapterInfo> DEFAULT_CHAPTER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_CARTOON_VIP = 0;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.cartoon_id == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = builder.cartoon_id;
            }
            if (builder.cartoon_name == null) {
                this.cartoon_name = "";
            } else {
                this.cartoon_name = builder.cartoon_name;
            }
            if (builder.author == null) {
                this.author = "";
            } else {
                this.author = builder.author;
            }
            if (builder.label_text == null) {
                this.label_text = "";
            } else {
                this.label_text = builder.label_text;
            }
            if (builder.cover_img == null) {
                this.cover_img = "";
            } else {
                this.cover_img = builder.cover_img;
            }
            if (builder.introduction == null) {
                this.introduction = "";
            } else {
                this.introduction = builder.introduction;
            }
            if (builder.update_info == null) {
                this.update_info = "";
            } else {
                this.update_info = builder.update_info;
            }
            if (builder.is_follow == null) {
                this.is_follow = DEFAULT_IS_FOLLOW;
            } else {
                this.is_follow = builder.is_follow;
            }
            if (builder.is_finish == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = builder.is_finish;
            }
            if (builder.can_download == null) {
                this.can_download = DEFAULT_CAN_DOWNLOAD;
            } else {
                this.can_download = builder.can_download;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.chapters == null) {
                this.chapters = DEFAULT_CHAPTERS;
            } else {
                this.chapters = immutableCopyOf(builder.chapters);
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.chapter_list == null) {
                this.chapter_list = DEFAULT_CHAPTER_LIST;
            } else {
                this.chapter_list = immutableCopyOf(builder.chapter_list);
            }
            if (builder.cartoon_vip == null) {
                this.cartoon_vip = DEFAULT_CARTOON_VIP;
            } else {
                this.cartoon_vip = builder.cartoon_vip;
            }
            this.user_info = builder.user_info;
            return;
        }
        this.cartoon_id = builder.cartoon_id;
        this.cartoon_name = builder.cartoon_name;
        this.author = builder.author;
        this.label_text = builder.label_text;
        this.cover_img = builder.cover_img;
        this.introduction = builder.introduction;
        this.update_info = builder.update_info;
        this.is_follow = builder.is_follow;
        this.is_finish = builder.is_finish;
        this.can_download = builder.can_download;
        this.forum_id = builder.forum_id;
        this.chapters = immutableCopyOf(builder.chapters);
        this.forum_name = builder.forum_name;
        this.chapter_list = immutableCopyOf(builder.chapter_list);
        this.cartoon_vip = builder.cartoon_vip;
        this.user_info = builder.user_info;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String author;
        public Integer can_download;
        public Long cartoon_id;
        public String cartoon_name;
        public Integer cartoon_vip;
        public List<CartoonChapterInfo> chapter_list;
        public List<Integer> chapters;
        public String cover_img;
        public Long forum_id;
        public String forum_name;
        public String introduction;
        public Integer is_finish;
        public Integer is_follow;
        public String label_text;
        public String update_info;
        public CartoonUserInfo user_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.cartoon_id = dataRes.cartoon_id;
                this.cartoon_name = dataRes.cartoon_name;
                this.author = dataRes.author;
                this.label_text = dataRes.label_text;
                this.cover_img = dataRes.cover_img;
                this.introduction = dataRes.introduction;
                this.update_info = dataRes.update_info;
                this.is_follow = dataRes.is_follow;
                this.is_finish = dataRes.is_finish;
                this.can_download = dataRes.can_download;
                this.forum_id = dataRes.forum_id;
                this.chapters = DataRes.copyOf(dataRes.chapters);
                this.forum_name = dataRes.forum_name;
                this.chapter_list = DataRes.copyOf(dataRes.chapter_list);
                this.cartoon_vip = dataRes.cartoon_vip;
                this.user_info = dataRes.user_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
