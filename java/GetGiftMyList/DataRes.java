package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GiftList> gift_list;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer money;
    @ProtoField(tag = 4)
    public final MoneyTxt money_txt;
    @ProtoField(tag = 5)
    public final Page page;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer total_num;
    public static final List<GiftList> DEFAULT_GIFT_LIST = Collections.emptyList();
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final Integer DEFAULT_MONEY = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.gift_list == null) {
                this.gift_list = DEFAULT_GIFT_LIST;
            } else {
                this.gift_list = immutableCopyOf(builder.gift_list);
            }
            if (builder.total_num == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = builder.total_num;
            }
            if (builder.money == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = builder.money;
            }
            this.money_txt = builder.money_txt;
            this.page = builder.page;
            return;
        }
        this.gift_list = immutableCopyOf(builder.gift_list);
        this.total_num = builder.total_num;
        this.money = builder.money;
        this.money_txt = builder.money_txt;
        this.page = builder.page;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<GiftList> gift_list;
        public Integer money;
        public MoneyTxt money_txt;
        public Page page;
        public Integer total_num;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.gift_list = DataRes.copyOf(dataRes.gift_list);
                this.total_num = dataRes.total_num;
                this.money = dataRes.money;
                this.money_txt = dataRes.money_txt;
                this.page = dataRes.page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
