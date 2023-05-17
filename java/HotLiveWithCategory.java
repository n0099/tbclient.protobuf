package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class HotLiveWithCategory extends Message {
    public static final String DEFAULT_BITMAP_WH_RATIO = "";
    public static final String DEFAULT_ENTRY_NAME = "";
    public static final String DEFAULT_LABEL_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bitmap_wh_ratio;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String entry_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String label_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThreadInfo> live;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer live_tab_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_id;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final List<ThreadInfo> DEFAULT_LIVE = Collections.emptyList();
    public static final Integer DEFAULT_LIVE_TAB_TYPE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<HotLiveWithCategory> {
        public String bitmap_wh_ratio;
        public String entry_name;
        public String label_name;
        public List<ThreadInfo> live;
        public Integer live_tab_type;
        public Integer tab_id;

        public Builder() {
        }

        public Builder(HotLiveWithCategory hotLiveWithCategory) {
            super(hotLiveWithCategory);
            if (hotLiveWithCategory == null) {
                return;
            }
            this.entry_name = hotLiveWithCategory.entry_name;
            this.tab_id = hotLiveWithCategory.tab_id;
            this.bitmap_wh_ratio = hotLiveWithCategory.bitmap_wh_ratio;
            this.live = Message.copyOf(hotLiveWithCategory.live);
            this.label_name = hotLiveWithCategory.label_name;
            this.live_tab_type = hotLiveWithCategory.live_tab_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotLiveWithCategory build(boolean z) {
            return new HotLiveWithCategory(this, z);
        }
    }

    public HotLiveWithCategory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.entry_name;
            if (str == null) {
                this.entry_name = "";
            } else {
                this.entry_name = str;
            }
            Integer num = builder.tab_id;
            if (num == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num;
            }
            String str2 = builder.bitmap_wh_ratio;
            if (str2 == null) {
                this.bitmap_wh_ratio = "";
            } else {
                this.bitmap_wh_ratio = str2;
            }
            List<ThreadInfo> list = builder.live;
            if (list == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = Message.immutableCopyOf(list);
            }
            String str3 = builder.label_name;
            if (str3 == null) {
                this.label_name = "";
            } else {
                this.label_name = str3;
            }
            Integer num2 = builder.live_tab_type;
            if (num2 == null) {
                this.live_tab_type = DEFAULT_LIVE_TAB_TYPE;
                return;
            } else {
                this.live_tab_type = num2;
                return;
            }
        }
        this.entry_name = builder.entry_name;
        this.tab_id = builder.tab_id;
        this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
        this.live = Message.immutableCopyOf(builder.live);
        this.label_name = builder.label_name;
        this.live_tab_type = builder.live_tab_type;
    }
}
