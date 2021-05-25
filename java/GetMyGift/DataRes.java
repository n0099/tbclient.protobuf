package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer blue_diamond;
    @ProtoField(tag = 8)
    public final presentMoneyTxt blue_diamond_txt;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer currency;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<PresentMyList> gift_list;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer money;
    @ProtoField(tag = 3)
    public final presentMoneyTxt money_txt;
    @ProtoField(tag = 5)
    public final PresetMyGiftPage page;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<FansRankUserInfo> rank_list;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer scene_id;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer total_num;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final Integer DEFAULT_MONEY = 0;
    public static final List<PresentMyList> DEFAULT_GIFT_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SCENE_ID = 0;
    public static final Integer DEFAULT_BLUE_DIAMOND = 0;
    public static final List<FansRankUserInfo> DEFAULT_RANK_LIST = Collections.emptyList();
    public static final Integer DEFAULT_CURRENCY = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer blue_diamond;
        public presentMoneyTxt blue_diamond_txt;
        public Integer currency;
        public List<PresentMyList> gift_list;
        public Integer money;
        public presentMoneyTxt money_txt;
        public PresetMyGiftPage page;
        public List<FansRankUserInfo> rank_list;
        public Integer scene_id;
        public Integer total_num;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.total_num = dataRes.total_num;
            this.money = dataRes.money;
            this.money_txt = dataRes.money_txt;
            this.gift_list = Message.copyOf(dataRes.gift_list);
            this.page = dataRes.page;
            this.scene_id = dataRes.scene_id;
            this.blue_diamond = dataRes.blue_diamond;
            this.blue_diamond_txt = dataRes.blue_diamond_txt;
            this.rank_list = Message.copyOf(dataRes.rank_list);
            this.currency = dataRes.currency;
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
            Integer num = builder.total_num;
            if (num == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = num;
            }
            Integer num2 = builder.money;
            if (num2 == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = num2;
            }
            this.money_txt = builder.money_txt;
            List<PresentMyList> list = builder.gift_list;
            if (list == null) {
                this.gift_list = DEFAULT_GIFT_LIST;
            } else {
                this.gift_list = Message.immutableCopyOf(list);
            }
            this.page = builder.page;
            Integer num3 = builder.scene_id;
            if (num3 == null) {
                this.scene_id = DEFAULT_SCENE_ID;
            } else {
                this.scene_id = num3;
            }
            Integer num4 = builder.blue_diamond;
            if (num4 == null) {
                this.blue_diamond = DEFAULT_BLUE_DIAMOND;
            } else {
                this.blue_diamond = num4;
            }
            this.blue_diamond_txt = builder.blue_diamond_txt;
            List<FansRankUserInfo> list2 = builder.rank_list;
            if (list2 == null) {
                this.rank_list = DEFAULT_RANK_LIST;
            } else {
                this.rank_list = Message.immutableCopyOf(list2);
            }
            Integer num5 = builder.currency;
            if (num5 == null) {
                this.currency = DEFAULT_CURRENCY;
                return;
            } else {
                this.currency = num5;
                return;
            }
        }
        this.total_num = builder.total_num;
        this.money = builder.money;
        this.money_txt = builder.money_txt;
        this.gift_list = Message.immutableCopyOf(builder.gift_list);
        this.page = builder.page;
        this.scene_id = builder.scene_id;
        this.blue_diamond = builder.blue_diamond;
        this.blue_diamond_txt = builder.blue_diamond_txt;
        this.rank_list = Message.immutableCopyOf(builder.rank_list);
        this.currency = builder.currency;
    }
}
