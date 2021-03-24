package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GameInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final GameInfo game_info;
    @ProtoField(tag = 2)
    public final RankInfo rank_info;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public GameInfo game_info;
        public RankInfo rank_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.game_info = dataRes.game_info;
            this.rank_info = dataRes.rank_info;
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
            this.game_info = builder.game_info;
            this.rank_info = builder.rank_info;
            return;
        }
        this.game_info = builder.game_info;
        this.rank_info = builder.rank_info;
    }
}
