package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
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

    private Entry(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.bitmap_wh_ratio == null) {
                this.bitmap_wh_ratio = "";
            } else {
                this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
            }
            if (builder.icon_type == null) {
                this.icon_type = DEFAULT_ICON_TYPE;
                return;
            } else {
                this.icon_type = builder.icon_type;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
        this.id = builder.id;
        this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
        this.icon_type = builder.icon_type;
    }

    /* loaded from: classes6.dex */
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
            if (entry != null) {
                this.icon = entry.icon;
                this.name = entry.name;
                this.id = entry.id;
                this.bitmap_wh_ratio = entry.bitmap_wh_ratio;
                this.icon_type = entry.icon_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Entry build(boolean z) {
            return new Entry(this, z);
        }
    }
}
