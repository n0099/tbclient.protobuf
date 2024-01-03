package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class RecreationRankInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_RANK_COLOR = "";
    public static final String DEFAULT_RANK_ICON = "";
    public static final String DEFAULT_RANK_LINK = "";
    public static final String DEFAULT_RANK_NAME = "";
    public static final Integer DEFAULT_RANK_SCORE = 0;
    public static final Integer DEFAULT_SHOW_TYPE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String rank_color;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String rank_icon;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rank_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String rank_name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rank_score;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer show_type;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecreationRankInfo> {
        public String icon;
        public String rank_color;
        public String rank_icon;
        public String rank_link;
        public String rank_name;
        public Integer rank_score;
        public Integer show_type;

        public Builder() {
        }

        public Builder(RecreationRankInfo recreationRankInfo) {
            super(recreationRankInfo);
            if (recreationRankInfo == null) {
                return;
            }
            this.icon = recreationRankInfo.icon;
            this.rank_name = recreationRankInfo.rank_name;
            this.rank_score = recreationRankInfo.rank_score;
            this.rank_link = recreationRankInfo.rank_link;
            this.rank_icon = recreationRankInfo.rank_icon;
            this.rank_color = recreationRankInfo.rank_color;
            this.show_type = recreationRankInfo.show_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecreationRankInfo build(boolean z) {
            return new RecreationRankInfo(this, z);
        }
    }

    public RecreationRankInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.rank_name;
            if (str2 == null) {
                this.rank_name = "";
            } else {
                this.rank_name = str2;
            }
            Integer num = builder.rank_score;
            if (num == null) {
                this.rank_score = DEFAULT_RANK_SCORE;
            } else {
                this.rank_score = num;
            }
            String str3 = builder.rank_link;
            if (str3 == null) {
                this.rank_link = "";
            } else {
                this.rank_link = str3;
            }
            String str4 = builder.rank_icon;
            if (str4 == null) {
                this.rank_icon = "";
            } else {
                this.rank_icon = str4;
            }
            String str5 = builder.rank_color;
            if (str5 == null) {
                this.rank_color = "";
            } else {
                this.rank_color = str5;
            }
            Integer num2 = builder.show_type;
            if (num2 == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
                return;
            } else {
                this.show_type = num2;
                return;
            }
        }
        this.icon = builder.icon;
        this.rank_name = builder.rank_name;
        this.rank_score = builder.rank_score;
        this.rank_link = builder.rank_link;
        this.rank_icon = builder.rank_icon;
        this.rank_color = builder.rank_color;
        this.show_type = builder.show_type;
    }
}
