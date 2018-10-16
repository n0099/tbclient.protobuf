package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class NaGuide extends Message {
    public static final String DEFAULT_DWNL_URL = "";
    public static final List<RecGuide> DEFAULT_REC_INFO = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String dwnl_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecGuide> rec_info;

    private NaGuide(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.dwnl_url == null) {
                this.dwnl_url = "";
            } else {
                this.dwnl_url = builder.dwnl_url;
            }
            if (builder.rec_info == null) {
                this.rec_info = DEFAULT_REC_INFO;
                return;
            } else {
                this.rec_info = immutableCopyOf(builder.rec_info);
                return;
            }
        }
        this.dwnl_url = builder.dwnl_url;
        this.rec_info = immutableCopyOf(builder.rec_info);
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<NaGuide> {
        public String dwnl_url;
        public List<RecGuide> rec_info;

        public Builder() {
        }

        public Builder(NaGuide naGuide) {
            super(naGuide);
            if (naGuide != null) {
                this.dwnl_url = naGuide.dwnl_url;
                this.rec_info = NaGuide.copyOf(naGuide.rec_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NaGuide build(boolean z) {
            return new NaGuide(this, z);
        }
    }
}
