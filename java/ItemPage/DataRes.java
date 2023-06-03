package tbclient.ItemPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlbumElement;
import tbclient.ItemGameCode;
import tbclient.ItemGameInfo;
import tbclient.ItemInfo;
import tbclient.RecommendForumInfo;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_LINK = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<AlbumElement> album_list;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer discussion_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ThreadInfo> discussion_list;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer has_tornado;
    @ProtoField(tag = 10)
    public final ItemGameCode item_game_code;
    @ProtoField(tag = 9)
    public final ItemGameInfo item_game_info;
    @ProtoField(tag = 1)
    public final ItemInfo item_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<RecommendForumInfo> recommend_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ItemInfo> recommend_item;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<ItemInfo> DEFAULT_RECOMMEND_ITEM = Collections.emptyList();
    public static final List<RecommendForumInfo> DEFAULT_RECOMMEND_FORUM = Collections.emptyList();
    public static final List<AlbumElement> DEFAULT_ALBUM_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_DISCUSSION_LIST = Collections.emptyList();
    public static final Integer DEFAULT_DISCUSSION_ID = 0;
    public static final Integer DEFAULT_HAS_TORNADO = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<AlbumElement> album_list;
        public Integer discussion_id;
        public List<ThreadInfo> discussion_list;
        public Integer has_tornado;
        public ItemGameCode item_game_code;
        public ItemGameInfo item_game_info;
        public ItemInfo item_info;
        public String link;
        public List<RecommendForumInfo> recommend_forum;
        public List<ItemInfo> recommend_item;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.item_info = dataRes.item_info;
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.recommend_item = Message.copyOf(dataRes.recommend_item);
            this.recommend_forum = Message.copyOf(dataRes.recommend_forum);
            this.link = dataRes.link;
            this.album_list = Message.copyOf(dataRes.album_list);
            this.discussion_list = Message.copyOf(dataRes.discussion_list);
            this.discussion_id = dataRes.discussion_id;
            this.item_game_info = dataRes.item_game_info;
            this.item_game_code = dataRes.item_game_code;
            this.has_tornado = dataRes.has_tornado;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.item_info = builder.item_info;
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            List<ItemInfo> list2 = builder.recommend_item;
            if (list2 == null) {
                this.recommend_item = DEFAULT_RECOMMEND_ITEM;
            } else {
                this.recommend_item = Message.immutableCopyOf(list2);
            }
            List<RecommendForumInfo> list3 = builder.recommend_forum;
            if (list3 == null) {
                this.recommend_forum = DEFAULT_RECOMMEND_FORUM;
            } else {
                this.recommend_forum = Message.immutableCopyOf(list3);
            }
            String str = builder.link;
            if (str == null) {
                this.link = "";
            } else {
                this.link = str;
            }
            List<AlbumElement> list4 = builder.album_list;
            if (list4 == null) {
                this.album_list = DEFAULT_ALBUM_LIST;
            } else {
                this.album_list = Message.immutableCopyOf(list4);
            }
            List<ThreadInfo> list5 = builder.discussion_list;
            if (list5 == null) {
                this.discussion_list = DEFAULT_DISCUSSION_LIST;
            } else {
                this.discussion_list = Message.immutableCopyOf(list5);
            }
            Integer num = builder.discussion_id;
            if (num == null) {
                this.discussion_id = DEFAULT_DISCUSSION_ID;
            } else {
                this.discussion_id = num;
            }
            this.item_game_info = builder.item_game_info;
            this.item_game_code = builder.item_game_code;
            Integer num2 = builder.has_tornado;
            if (num2 == null) {
                this.has_tornado = DEFAULT_HAS_TORNADO;
                return;
            } else {
                this.has_tornado = num2;
                return;
            }
        }
        this.item_info = builder.item_info;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.recommend_item = Message.immutableCopyOf(builder.recommend_item);
        this.recommend_forum = Message.immutableCopyOf(builder.recommend_forum);
        this.link = builder.link;
        this.album_list = Message.immutableCopyOf(builder.album_list);
        this.discussion_list = Message.immutableCopyOf(builder.discussion_list);
        this.discussion_id = builder.discussion_id;
        this.item_game_info = builder.item_game_info;
        this.item_game_code = builder.item_game_code;
        this.has_tornado = builder.has_tornado;
    }
}
