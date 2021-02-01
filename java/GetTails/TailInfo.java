package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TailInfo extends Message {
    public static final String DEFAULT_FONTCOLOR = "";
    public static final String DEFAULT_FONTKEYNAME = "";
    public static final String DEFAULT_TAILCONTENT = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String fontColor;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String fontKeyName;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer is_selected;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tailContent;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer tailId;
    public static final Integer DEFAULT_TAILID = 0;
    public static final Integer DEFAULT_IS_SELECTED = 0;

    private TailInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tailId == null) {
                this.tailId = DEFAULT_TAILID;
            } else {
                this.tailId = builder.tailId;
            }
            if (builder.is_selected == null) {
                this.is_selected = DEFAULT_IS_SELECTED;
            } else {
                this.is_selected = builder.is_selected;
            }
            if (builder.tailContent == null) {
                this.tailContent = "";
            } else {
                this.tailContent = builder.tailContent;
            }
            if (builder.fontColor == null) {
                this.fontColor = "";
            } else {
                this.fontColor = builder.fontColor;
            }
            if (builder.fontKeyName == null) {
                this.fontKeyName = "";
                return;
            } else {
                this.fontKeyName = builder.fontKeyName;
                return;
            }
        }
        this.tailId = builder.tailId;
        this.is_selected = builder.is_selected;
        this.tailContent = builder.tailContent;
        this.fontColor = builder.fontColor;
        this.fontKeyName = builder.fontKeyName;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TailInfo> {
        public String fontColor;
        public String fontKeyName;
        public Integer is_selected;
        public String tailContent;
        public Integer tailId;

        public Builder() {
        }

        public Builder(TailInfo tailInfo) {
            super(tailInfo);
            if (tailInfo != null) {
                this.tailId = tailInfo.tailId;
                this.is_selected = tailInfo.is_selected;
                this.tailContent = tailInfo.tailContent;
                this.fontColor = tailInfo.fontColor;
                this.fontKeyName = tailInfo.fontKeyName;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TailInfo build(boolean z) {
            return new TailInfo(this, z);
        }
    }
}
