package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipRank extends Message {
    public static final String DEFAULT_CARD_ID = "";
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_CLASS_URL = "";
    public static final String DEFAULT_CLASS_URL_NAME = "";
    public static final Integer DEFAULT_MY_SCORE_RANK = 0;
    public static final Integer DEFAULT_TENDENCY = 0;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String card_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String class_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_url_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer my_score_rank;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer tendency;

    private VipRank(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.class_name == null) {
                this.class_name = "";
            } else {
                this.class_name = builder.class_name;
            }
            if (builder.class_url_name == null) {
                this.class_url_name = "";
            } else {
                this.class_url_name = builder.class_url_name;
            }
            if (builder.class_url == null) {
                this.class_url = "";
            } else {
                this.class_url = builder.class_url;
            }
            if (builder.my_score_rank == null) {
                this.my_score_rank = DEFAULT_MY_SCORE_RANK;
            } else {
                this.my_score_rank = builder.my_score_rank;
            }
            if (builder.tendency == null) {
                this.tendency = DEFAULT_TENDENCY;
            } else {
                this.tendency = builder.tendency;
            }
            if (builder.card_id == null) {
                this.card_id = "";
                return;
            } else {
                this.card_id = builder.card_id;
                return;
            }
        }
        this.class_name = builder.class_name;
        this.class_url_name = builder.class_url_name;
        this.class_url = builder.class_url;
        this.my_score_rank = builder.my_score_rank;
        this.tendency = builder.tendency;
        this.card_id = builder.card_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipRank> {
        public String card_id;
        public String class_name;
        public String class_url;
        public String class_url_name;
        public Integer my_score_rank;
        public Integer tendency;

        public Builder() {
        }

        public Builder(VipRank vipRank) {
            super(vipRank);
            if (vipRank != null) {
                this.class_name = vipRank.class_name;
                this.class_url_name = vipRank.class_url_name;
                this.class_url = vipRank.class_url;
                this.my_score_rank = vipRank.my_score_rank;
                this.tendency = vipRank.tendency;
                this.card_id = vipRank.card_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipRank build(boolean z) {
            return new VipRank(this, z);
        }
    }
}
