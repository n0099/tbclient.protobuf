package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Ranking extends Message {
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_RANK_NUM = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rank_num;
    @ProtoField(tag = 3)
    public final RankingParam ranking_param;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Ranking> {
        public String name;
        public Integer rank_num;
        public RankingParam ranking_param;

        public Builder() {
        }

        public Builder(Ranking ranking) {
            super(ranking);
            if (ranking == null) {
                return;
            }
            this.name = ranking.name;
            this.rank_num = ranking.rank_num;
            this.ranking_param = ranking.ranking_param;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Ranking build(boolean z) {
            return new Ranking(this, z);
        }
    }

    public Ranking(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.rank_num;
            if (num == null) {
                this.rank_num = DEFAULT_RANK_NUM;
            } else {
                this.rank_num = num;
            }
            this.ranking_param = builder.ranking_param;
            return;
        }
        this.name = builder.name;
        this.rank_num = builder.rank_num;
        this.ranking_param = builder.ranking_param;
    }
}
