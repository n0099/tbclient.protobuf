package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumInfo;
import tbclient.Item;
import tbclient.RecommendForumInfo;
import tbclient.SugLiveInfo;
import tbclient.SugRankingInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 4)
    public final RecommendForumInfo forum_card;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ForumInfo> forum_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer forum_loc;
    @ProtoField(tag = 5)
    public final Item item_card;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> list;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<SugLiveInfo> live_card;
    @ProtoField(tag = 7)
    public final SugRankingInfo ranking_card;
    public static final Integer DEFAULT_FORUM_LOC = 0;
    public static final List<String> DEFAULT_LIST = Collections.emptyList();
    public static final List<ForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
    public static final List<SugLiveInfo> DEFAULT_LIVE_CARD = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public RecommendForumInfo forum_card;
        public List<ForumInfo> forum_list;
        public Integer forum_loc;
        public Item item_card;
        public List<String> list;
        public List<SugLiveInfo> live_card;
        public SugRankingInfo ranking_card;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.forum_loc = dataRes.forum_loc;
            this.list = Message.copyOf(dataRes.list);
            this.forum_list = Message.copyOf(dataRes.forum_list);
            this.forum_card = dataRes.forum_card;
            this.item_card = dataRes.item_card;
            this.live_card = Message.copyOf(dataRes.live_card);
            this.ranking_card = dataRes.ranking_card;
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
            Integer num = builder.forum_loc;
            if (num == null) {
                this.forum_loc = DEFAULT_FORUM_LOC;
            } else {
                this.forum_loc = num;
            }
            List<String> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = Message.immutableCopyOf(list);
            }
            List<ForumInfo> list2 = builder.forum_list;
            if (list2 == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list2);
            }
            this.forum_card = builder.forum_card;
            this.item_card = builder.item_card;
            List<SugLiveInfo> list3 = builder.live_card;
            if (list3 == null) {
                this.live_card = DEFAULT_LIVE_CARD;
            } else {
                this.live_card = Message.immutableCopyOf(list3);
            }
            this.ranking_card = builder.ranking_card;
            return;
        }
        this.forum_loc = builder.forum_loc;
        this.list = Message.immutableCopyOf(builder.list);
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.forum_card = builder.forum_card;
        this.item_card = builder.item_card;
        this.live_card = Message.immutableCopyOf(builder.live_card);
        this.ranking_card = builder.ranking_card;
    }
}
