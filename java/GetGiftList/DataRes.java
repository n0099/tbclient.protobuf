package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ADDFREE_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String addfree_url;
    @ProtoField(tag = 8)
    public final UrlTitle currency_txt;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer currency_type;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer free_chance;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<PresentGiftList1> gift_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PresentCategoryList> list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PresentNumInfo> num_info;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer scene_id;
    public static final List<PresentCategoryList> DEFAULT_LIST = Collections.emptyList();
    public static final List<PresentNumInfo> DEFAULT_NUM_INFO = Collections.emptyList();
    public static final List<PresentGiftList1> DEFAULT_GIFT_LIST = Collections.emptyList();
    public static final Integer DEFAULT_FREE_CHANCE = 0;
    public static final Integer DEFAULT_SCENE_ID = 0;
    public static final Integer DEFAULT_CURRENCY_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String addfree_url;
        public UrlTitle currency_txt;
        public Integer currency_type;
        public Integer free_chance;
        public List<PresentGiftList1> gift_list;
        public List<PresentCategoryList> list;
        public List<PresentNumInfo> num_info;
        public Integer scene_id;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.list = Message.copyOf(dataRes.list);
            this.num_info = Message.copyOf(dataRes.num_info);
            this.addfree_url = dataRes.addfree_url;
            this.gift_list = Message.copyOf(dataRes.gift_list);
            this.free_chance = dataRes.free_chance;
            this.scene_id = dataRes.scene_id;
            this.currency_type = dataRes.currency_type;
            this.currency_txt = dataRes.currency_txt;
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
            List<PresentCategoryList> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = Message.immutableCopyOf(list);
            }
            List<PresentNumInfo> list2 = builder.num_info;
            if (list2 == null) {
                this.num_info = DEFAULT_NUM_INFO;
            } else {
                this.num_info = Message.immutableCopyOf(list2);
            }
            String str = builder.addfree_url;
            if (str == null) {
                this.addfree_url = "";
            } else {
                this.addfree_url = str;
            }
            List<PresentGiftList1> list3 = builder.gift_list;
            if (list3 == null) {
                this.gift_list = DEFAULT_GIFT_LIST;
            } else {
                this.gift_list = Message.immutableCopyOf(list3);
            }
            Integer num = builder.free_chance;
            if (num == null) {
                this.free_chance = DEFAULT_FREE_CHANCE;
            } else {
                this.free_chance = num;
            }
            Integer num2 = builder.scene_id;
            if (num2 == null) {
                this.scene_id = DEFAULT_SCENE_ID;
            } else {
                this.scene_id = num2;
            }
            Integer num3 = builder.currency_type;
            if (num3 == null) {
                this.currency_type = DEFAULT_CURRENCY_TYPE;
            } else {
                this.currency_type = num3;
            }
            this.currency_txt = builder.currency_txt;
            return;
        }
        this.list = Message.immutableCopyOf(builder.list);
        this.num_info = Message.immutableCopyOf(builder.num_info);
        this.addfree_url = builder.addfree_url;
        this.gift_list = Message.immutableCopyOf(builder.gift_list);
        this.free_chance = builder.free_chance;
        this.scene_id = builder.scene_id;
        this.currency_type = builder.currency_type;
        this.currency_txt = builder.currency_txt;
    }
}
