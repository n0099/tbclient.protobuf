package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class RankingParam extends Message {
    public static final String DEFAULT_SORT_TYPE = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rank_code;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer rank_type;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sort_type;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer tab_id;
    public static final Integer DEFAULT_RANK_TYPE = 0;
    public static final Integer DEFAULT_RANK_CODE = 0;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RankingParam> {
        public Integer pn;
        public Integer rank_code;
        public Integer rank_type;
        public Integer rn;
        public String sort_type;
        public Integer tab_id;

        public Builder() {
        }

        public Builder(RankingParam rankingParam) {
            super(rankingParam);
            if (rankingParam == null) {
                return;
            }
            this.rank_type = rankingParam.rank_type;
            this.rank_code = rankingParam.rank_code;
            this.sort_type = rankingParam.sort_type;
            this.tab_id = rankingParam.tab_id;
            this.pn = rankingParam.pn;
            this.rn = rankingParam.rn;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RankingParam build(boolean z) {
            return new RankingParam(this, z);
        }
    }

    public RankingParam(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.rank_type;
            if (num == null) {
                this.rank_type = DEFAULT_RANK_TYPE;
            } else {
                this.rank_type = num;
            }
            Integer num2 = builder.rank_code;
            if (num2 == null) {
                this.rank_code = DEFAULT_RANK_CODE;
            } else {
                this.rank_code = num2;
            }
            String str = builder.sort_type;
            if (str == null) {
                this.sort_type = "";
            } else {
                this.sort_type = str;
            }
            Integer num3 = builder.tab_id;
            if (num3 == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num3;
            }
            Integer num4 = builder.pn;
            if (num4 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num4;
            }
            Integer num5 = builder.rn;
            if (num5 == null) {
                this.rn = DEFAULT_RN;
                return;
            } else {
                this.rn = num5;
                return;
            }
        }
        this.rank_type = builder.rank_type;
        this.rank_code = builder.rank_code;
        this.sort_type = builder.sort_type;
        this.tab_id = builder.tab_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
    }
}
