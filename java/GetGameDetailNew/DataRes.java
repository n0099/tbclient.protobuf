package tbclient.GetGameDetailNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;
import tbclient.RecommendForumInfo;
import tbclient.SimpleThreadInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 6)
    public final RecommendForumInfo forum_info;
    @ProtoField(tag = 1)
    public final GameInfo game_info;
    @ProtoField(tag = 2)
    public final RankInfo rank_info;
    @ProtoField(tag = 3)
    public final RelateGame relate_game;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<SimpleThreadInfo> relate_thread;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<GameInfo> user_recommend;
    public static final List<GameInfo> DEFAULT_USER_RECOMMEND = Collections.emptyList();
    public static final List<SimpleThreadInfo> DEFAULT_RELATE_THREAD = Collections.emptyList();

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.game_info = builder.game_info;
            this.rank_info = builder.rank_info;
            this.relate_game = builder.relate_game;
            if (builder.user_recommend == null) {
                this.user_recommend = DEFAULT_USER_RECOMMEND;
            } else {
                this.user_recommend = immutableCopyOf(builder.user_recommend);
            }
            if (builder.relate_thread == null) {
                this.relate_thread = DEFAULT_RELATE_THREAD;
            } else {
                this.relate_thread = immutableCopyOf(builder.relate_thread);
            }
            this.forum_info = builder.forum_info;
            return;
        }
        this.game_info = builder.game_info;
        this.rank_info = builder.rank_info;
        this.relate_game = builder.relate_game;
        this.user_recommend = immutableCopyOf(builder.user_recommend);
        this.relate_thread = immutableCopyOf(builder.relate_thread);
        this.forum_info = builder.forum_info;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public RecommendForumInfo forum_info;
        public GameInfo game_info;
        public RankInfo rank_info;
        public RelateGame relate_game;
        public List<SimpleThreadInfo> relate_thread;
        public List<GameInfo> user_recommend;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.game_info = dataRes.game_info;
                this.rank_info = dataRes.rank_info;
                this.relate_game = dataRes.relate_game;
                this.user_recommend = DataRes.copyOf(dataRes.user_recommend);
                this.relate_thread = DataRes.copyOf(dataRes.relate_thread);
                this.forum_info = dataRes.forum_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
