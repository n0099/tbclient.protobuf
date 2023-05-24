package tbclient.GetLiveSquareTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class EntryInfo extends Message {
    public static final String DEFAULT_BITMAP_WH_RATIO = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bitmap_wh_ratio;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer icon_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
    public final List<String> live_tab_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_ICON_TYPE = 0;
    public static final List<String> DEFAULT_LIVE_TAB_TYPE = Collections.emptyList();

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<EntryInfo> {
        public String bitmap_wh_ratio;
        public String icon;
        public Integer icon_type;
        public Integer id;
        public List<String> live_tab_type;
        public String name;

        public Builder() {
        }

        public Builder(EntryInfo entryInfo) {
            super(entryInfo);
            if (entryInfo == null) {
                return;
            }
            this.id = entryInfo.id;
            this.name = entryInfo.name;
            this.icon = entryInfo.icon;
            this.bitmap_wh_ratio = entryInfo.bitmap_wh_ratio;
            this.icon_type = entryInfo.icon_type;
            this.live_tab_type = Message.copyOf(entryInfo.live_tab_type);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EntryInfo build(boolean z) {
            return new EntryInfo(this, z);
        }
    }

    public EntryInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            String str3 = builder.bitmap_wh_ratio;
            if (str3 == null) {
                this.bitmap_wh_ratio = "";
            } else {
                this.bitmap_wh_ratio = str3;
            }
            Integer num2 = builder.icon_type;
            if (num2 == null) {
                this.icon_type = DEFAULT_ICON_TYPE;
            } else {
                this.icon_type = num2;
            }
            List<String> list = builder.live_tab_type;
            if (list == null) {
                this.live_tab_type = DEFAULT_LIVE_TAB_TYPE;
                return;
            } else {
                this.live_tab_type = Message.immutableCopyOf(list);
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.icon = builder.icon;
        this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
        this.icon_type = builder.icon_type;
        this.live_tab_type = Message.immutableCopyOf(builder.live_tab_type);
    }
}
