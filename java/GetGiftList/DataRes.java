package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ADDFREE_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String addfree_url;
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

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = immutableCopyOf(builder.list);
            }
            if (builder.num_info == null) {
                this.num_info = DEFAULT_NUM_INFO;
            } else {
                this.num_info = immutableCopyOf(builder.num_info);
            }
            if (builder.addfree_url == null) {
                this.addfree_url = "";
            } else {
                this.addfree_url = builder.addfree_url;
            }
            if (builder.gift_list == null) {
                this.gift_list = DEFAULT_GIFT_LIST;
            } else {
                this.gift_list = immutableCopyOf(builder.gift_list);
            }
            if (builder.free_chance == null) {
                this.free_chance = DEFAULT_FREE_CHANCE;
            } else {
                this.free_chance = builder.free_chance;
            }
            if (builder.scene_id == null) {
                this.scene_id = DEFAULT_SCENE_ID;
                return;
            } else {
                this.scene_id = builder.scene_id;
                return;
            }
        }
        this.list = immutableCopyOf(builder.list);
        this.num_info = immutableCopyOf(builder.num_info);
        this.addfree_url = builder.addfree_url;
        this.gift_list = immutableCopyOf(builder.gift_list);
        this.free_chance = builder.free_chance;
        this.scene_id = builder.scene_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String addfree_url;
        public Integer free_chance;
        public List<PresentGiftList1> gift_list;
        public List<PresentCategoryList> list;
        public List<PresentNumInfo> num_info;
        public Integer scene_id;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.list = DataRes.copyOf(dataRes.list);
                this.num_info = DataRes.copyOf(dataRes.num_info);
                this.addfree_url = dataRes.addfree_url;
                this.gift_list = DataRes.copyOf(dataRes.gift_list);
                this.free_chance = dataRes.free_chance;
                this.scene_id = dataRes.scene_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
