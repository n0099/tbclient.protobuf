package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class OperationActivity extends Message {
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<OperationActivity> {
        public String image;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(OperationActivity operationActivity) {
            super(operationActivity);
            if (operationActivity == null) {
                return;
            }
            this.title = operationActivity.title;
            this.image = operationActivity.image;
            this.url = operationActivity.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OperationActivity build(boolean z) {
            return new OperationActivity(this, z);
        }
    }

    public OperationActivity(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.image;
            if (str2 == null) {
                this.image = "";
            } else {
                this.image = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
                return;
            } else {
                this.url = str3;
                return;
            }
        }
        this.title = builder.title;
        this.image = builder.image;
        this.url = builder.url;
    }
}
