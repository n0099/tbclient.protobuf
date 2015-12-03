package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class IconInfo extends Message {
    public static final String DEFAULT_ICONID = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PICURL = "";
    public static final String DEFAULT_SIGN = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<Discount> discount;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer dubi;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer duration;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer hide;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String iconId;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer non_member_t;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String picUrl;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String sign;
    public static final Integer DEFAULT_NON_MEMBER_T = 0;
    public static final Integer DEFAULT_DUBI = 0;
    public static final Integer DEFAULT_DURATION = 0;
    public static final Integer DEFAULT_HIDE = 0;
    public static final List<Discount> DEFAULT_DISCOUNT = Collections.emptyList();

    /* synthetic */ IconInfo(Builder builder, boolean z, IconInfo iconInfo) {
        this(builder, z);
    }

    private IconInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.iconId == null) {
                this.iconId = "";
            } else {
                this.iconId = builder.iconId;
            }
            if (builder.picUrl == null) {
                this.picUrl = "";
            } else {
                this.picUrl = builder.picUrl;
            }
            if (builder.non_member_t == null) {
                this.non_member_t = DEFAULT_NON_MEMBER_T;
            } else {
                this.non_member_t = builder.non_member_t;
            }
            if (builder.dubi == null) {
                this.dubi = DEFAULT_DUBI;
            } else {
                this.dubi = builder.dubi;
            }
            if (builder.duration == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = builder.duration;
            }
            if (builder.hide == null) {
                this.hide = DEFAULT_HIDE;
            } else {
                this.hide = builder.hide;
            }
            if (builder.discount == null) {
                this.discount = DEFAULT_DISCOUNT;
            } else {
                this.discount = immutableCopyOf(builder.discount);
            }
            if (builder.sign == null) {
                this.sign = "";
                return;
            } else {
                this.sign = builder.sign;
                return;
            }
        }
        this.name = builder.name;
        this.iconId = builder.iconId;
        this.picUrl = builder.picUrl;
        this.non_member_t = builder.non_member_t;
        this.dubi = builder.dubi;
        this.duration = builder.duration;
        this.hide = builder.hide;
        this.discount = immutableCopyOf(builder.discount);
        this.sign = builder.sign;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<IconInfo> {
        public List<Discount> discount;
        public Integer dubi;
        public Integer duration;
        public Integer hide;
        public String iconId;
        public String name;
        public Integer non_member_t;
        public String picUrl;
        public String sign;

        public Builder() {
        }

        public Builder(IconInfo iconInfo) {
            super(iconInfo);
            if (iconInfo != null) {
                this.name = iconInfo.name;
                this.iconId = iconInfo.iconId;
                this.picUrl = iconInfo.picUrl;
                this.non_member_t = iconInfo.non_member_t;
                this.dubi = iconInfo.dubi;
                this.duration = iconInfo.duration;
                this.hide = iconInfo.hide;
                this.discount = IconInfo.copyOf(iconInfo.discount);
                this.sign = iconInfo.sign;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public IconInfo build(boolean z) {
            return new IconInfo(this, z, null);
        }
    }
}
