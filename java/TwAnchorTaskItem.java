package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class TwAnchorTaskItem extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PROGRESS = "";
    public static final String DEFAULT_REMARK = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer complete;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String progress;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String remark;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_COMPLETE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TwAnchorTaskItem> {
        public Integer complete;
        public String icon;
        public Integer id;
        public String name;
        public String progress;
        public String remark;

        public Builder() {
        }

        public Builder(TwAnchorTaskItem twAnchorTaskItem) {
            super(twAnchorTaskItem);
            if (twAnchorTaskItem == null) {
                return;
            }
            this.id = twAnchorTaskItem.id;
            this.name = twAnchorTaskItem.name;
            this.progress = twAnchorTaskItem.progress;
            this.complete = twAnchorTaskItem.complete;
            this.remark = twAnchorTaskItem.remark;
            this.icon = twAnchorTaskItem.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorTaskItem build(boolean z) {
            return new TwAnchorTaskItem(this, z);
        }
    }

    public TwAnchorTaskItem(Builder builder, boolean z) {
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
            String str2 = builder.progress;
            if (str2 == null) {
                this.progress = "";
            } else {
                this.progress = str2;
            }
            Integer num2 = builder.complete;
            if (num2 == null) {
                this.complete = DEFAULT_COMPLETE;
            } else {
                this.complete = num2;
            }
            String str3 = builder.remark;
            if (str3 == null) {
                this.remark = "";
            } else {
                this.remark = str3;
            }
            String str4 = builder.icon;
            if (str4 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str4;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.progress = builder.progress;
        this.complete = builder.complete;
        this.remark = builder.remark;
        this.icon = builder.icon;
    }
}
