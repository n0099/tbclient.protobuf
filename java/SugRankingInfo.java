package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SugRankingInfo extends Message {
    public static final String DEFAULT_RANK_TITLE = "";
    @ProtoField(tag = 2)
    public final RankingParam rank_param;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String rank_title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SugRankingInfo> {
        public RankingParam rank_param;
        public String rank_title;

        public Builder() {
        }

        public Builder(SugRankingInfo sugRankingInfo) {
            super(sugRankingInfo);
            if (sugRankingInfo == null) {
                return;
            }
            this.rank_title = sugRankingInfo.rank_title;
            this.rank_param = sugRankingInfo.rank_param;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SugRankingInfo build(boolean z) {
            return new SugRankingInfo(this, z);
        }
    }

    public SugRankingInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.rank_title;
            if (str == null) {
                this.rank_title = "";
            } else {
                this.rank_title = str;
            }
            this.rank_param = builder.rank_param;
            return;
        }
        this.rank_title = builder.rank_title;
        this.rank_param = builder.rank_param;
    }
}
