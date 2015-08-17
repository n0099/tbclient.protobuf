package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<AdList> DEFAULT_AD_LIST = Collections.emptyList();
    public static final List<RecommendGame> DEFAULT_RECOMMEND_GAME = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AdList> ad_list;
    @ProtoField(tag = 2)
    public final GameList game_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<RecommendGame> recommend_game;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ad_list == null) {
                this.ad_list = DEFAULT_AD_LIST;
            } else {
                this.ad_list = immutableCopyOf(builder.ad_list);
            }
            this.game_list = builder.game_list;
            if (builder.recommend_game == null) {
                this.recommend_game = DEFAULT_RECOMMEND_GAME;
                return;
            } else {
                this.recommend_game = immutableCopyOf(builder.recommend_game);
                return;
            }
        }
        this.ad_list = immutableCopyOf(builder.ad_list);
        this.game_list = builder.game_list;
        this.recommend_game = immutableCopyOf(builder.recommend_game);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<AdList> ad_list;
        public GameList game_list;
        public List<RecommendGame> recommend_game;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.ad_list = DataRes.copyOf(dataRes.ad_list);
                this.game_list = dataRes.game_list;
                this.recommend_game = DataRes.copyOf(dataRes.recommend_game);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
