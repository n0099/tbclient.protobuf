package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class AcrossForumIcon extends Message {
    public static final String DEFAULT_ICON_URL = "";
    public static final Integer DEFAULT_PIC_TYPE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pic_type;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AcrossForumIcon> {
        public String icon_url;
        public Integer pic_type;

        public Builder() {
        }

        public Builder(AcrossForumIcon acrossForumIcon) {
            super(acrossForumIcon);
            if (acrossForumIcon == null) {
                return;
            }
            this.icon_url = acrossForumIcon.icon_url;
            this.pic_type = acrossForumIcon.pic_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AcrossForumIcon build(boolean z) {
            return new AcrossForumIcon(this, z);
        }
    }

    public AcrossForumIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            Integer num = builder.pic_type;
            if (num == null) {
                this.pic_type = DEFAULT_PIC_TYPE;
                return;
            } else {
                this.pic_type = num;
                return;
            }
        }
        this.icon_url = builder.icon_url;
        this.pic_type = builder.pic_type;
    }
}
