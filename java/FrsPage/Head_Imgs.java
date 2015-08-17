package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Head_Imgs extends Message {
    public static final String DEFAULT_IMG_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;

    /* synthetic */ Head_Imgs(Builder builder, boolean z, Head_Imgs head_Imgs) {
        this(builder, z);
    }

    private Head_Imgs(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
                return;
            } else {
                this.img_url = builder.img_url;
                return;
            }
        }
        this.img_url = builder.img_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Head_Imgs> {
        public String img_url;

        public Builder() {
        }

        public Builder(Head_Imgs head_Imgs) {
            super(head_Imgs);
            if (head_Imgs != null) {
                this.img_url = head_Imgs.img_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Head_Imgs build(boolean z) {
            return new Head_Imgs(this, z, null);
        }
    }
}
