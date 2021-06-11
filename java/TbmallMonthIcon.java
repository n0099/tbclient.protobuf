package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class TbmallMonthIcon extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_MON = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String mon;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TbmallMonthIcon> {
        public String icon;
        public String mon;

        public Builder() {
        }

        public Builder(TbmallMonthIcon tbmallMonthIcon) {
            super(tbmallMonthIcon);
            if (tbmallMonthIcon == null) {
                return;
            }
            this.mon = tbmallMonthIcon.mon;
            this.icon = tbmallMonthIcon.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbmallMonthIcon build(boolean z) {
            return new TbmallMonthIcon(this, z);
        }
    }

    public TbmallMonthIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.mon;
            if (str == null) {
                this.mon = "";
            } else {
                this.mon = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str2;
                return;
            }
        }
        this.mon = builder.mon;
        this.icon = builder.icon;
    }
}
