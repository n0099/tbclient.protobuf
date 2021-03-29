package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Entry extends Message {
    public static final String DEFAULT_BITMAP_WH_RATIO = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bitmap_wh_ratio;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer icon_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_ICON_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Entry> {
        public String bitmap_wh_ratio;
        public String icon;
        public Integer icon_type;
        public Integer id;
        public String name;

        public Builder() {
        }

        public Builder(Entry entry) {
            super(entry);
            if (entry == null) {
                return;
            }
            this.icon = entry.icon;
            this.name = entry.name;
            this.id = entry.id;
            this.bitmap_wh_ratio = entry.bitmap_wh_ratio;
            this.icon_type = entry.icon_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Entry build(boolean z) {
            return new Entry(this, z);
        }
    }

    public Entry(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
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
                return;
            } else {
                this.icon_type = num2;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
        this.id = builder.id;
        this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
        this.icon_type = builder.icon_type;
    }
}
