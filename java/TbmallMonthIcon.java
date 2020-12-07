package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class TbmallMonthIcon extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_MON = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String mon;

    private TbmallMonthIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.mon == null) {
                this.mon = "";
            } else {
                this.mon = builder.mon;
            }
            if (builder.icon == null) {
                this.icon = "";
                return;
            } else {
                this.icon = builder.icon;
                return;
            }
        }
        this.mon = builder.mon;
        this.icon = builder.icon;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<TbmallMonthIcon> {
        public String icon;
        public String mon;

        public Builder() {
        }

        public Builder(TbmallMonthIcon tbmallMonthIcon) {
            super(tbmallMonthIcon);
            if (tbmallMonthIcon != null) {
                this.mon = tbmallMonthIcon.mon;
                this.icon = tbmallMonthIcon.icon;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbmallMonthIcon build(boolean z) {
            return new TbmallMonthIcon(this, z);
        }
    }
}
