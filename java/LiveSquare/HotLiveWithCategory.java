package tbclient.LiveSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes4.dex */
public final class HotLiveWithCategory extends Message {
    public static final String DEFAULT_BITMAP_WH_RATIO = "";
    public static final String DEFAULT_ENTRY_NAME = "";
    public static final String DEFAULT_LABEL_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bitmap_wh_ratio;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer entry_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String entry_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String label_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThreadInfo> live;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer live_tab_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> sub_type_list;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer tab_id;
    public static final Integer DEFAULT_ENTRY_ID = 0;
    public static final List<ThreadInfo> DEFAULT_LIVE = Collections.emptyList();
    public static final Integer DEFAULT_LIVE_TAB_TYPE = 0;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final List<String> DEFAULT_SUB_TYPE_LIST = Collections.emptyList();

    private HotLiveWithCategory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.entry_name == null) {
                this.entry_name = "";
            } else {
                this.entry_name = builder.entry_name;
            }
            if (builder.entry_id == null) {
                this.entry_id = DEFAULT_ENTRY_ID;
            } else {
                this.entry_id = builder.entry_id;
            }
            if (builder.bitmap_wh_ratio == null) {
                this.bitmap_wh_ratio = "";
            } else {
                this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
            }
            if (builder.live == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = immutableCopyOf(builder.live);
            }
            if (builder.label_name == null) {
                this.label_name = "";
            } else {
                this.label_name = builder.label_name;
            }
            if (builder.live_tab_type == null) {
                this.live_tab_type = DEFAULT_LIVE_TAB_TYPE;
            } else {
                this.live_tab_type = builder.live_tab_type;
            }
            if (builder.tab_id == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = builder.tab_id;
            }
            if (builder.sub_type_list == null) {
                this.sub_type_list = DEFAULT_SUB_TYPE_LIST;
                return;
            } else {
                this.sub_type_list = immutableCopyOf(builder.sub_type_list);
                return;
            }
        }
        this.entry_name = builder.entry_name;
        this.entry_id = builder.entry_id;
        this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
        this.live = immutableCopyOf(builder.live);
        this.label_name = builder.label_name;
        this.live_tab_type = builder.live_tab_type;
        this.tab_id = builder.tab_id;
        this.sub_type_list = immutableCopyOf(builder.sub_type_list);
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<HotLiveWithCategory> {
        public String bitmap_wh_ratio;
        public Integer entry_id;
        public String entry_name;
        public String label_name;
        public List<ThreadInfo> live;
        public Integer live_tab_type;
        public List<String> sub_type_list;
        public Integer tab_id;

        public Builder() {
        }

        public Builder(HotLiveWithCategory hotLiveWithCategory) {
            super(hotLiveWithCategory);
            if (hotLiveWithCategory != null) {
                this.entry_name = hotLiveWithCategory.entry_name;
                this.entry_id = hotLiveWithCategory.entry_id;
                this.bitmap_wh_ratio = hotLiveWithCategory.bitmap_wh_ratio;
                this.live = HotLiveWithCategory.copyOf(hotLiveWithCategory.live);
                this.label_name = hotLiveWithCategory.label_name;
                this.live_tab_type = hotLiveWithCategory.live_tab_type;
                this.tab_id = hotLiveWithCategory.tab_id;
                this.sub_type_list = HotLiveWithCategory.copyOf(hotLiveWithCategory.sub_type_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotLiveWithCategory build(boolean z) {
            return new HotLiveWithCategory(this, z);
        }
    }
}
