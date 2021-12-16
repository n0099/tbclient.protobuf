package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class FeatureCardCompetitionSubNode extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_COMPETITION_IMAGE = "";
    public static final String DEFAULT_TEAM1_IMAGE = "";
    public static final String DEFAULT_TEAM1_NAME = "";
    public static final String DEFAULT_TEAM2_IMAGE = "";
    public static final String DEFAULT_TEAM2_NAME = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String competition_image;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String team1_image;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String team1_name;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String team2_image;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String team2_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<FeatureCardCompetitionSubNode> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String competition_image;
        public String team1_image;
        public String team1_name;
        public String team2_image;
        public String team2_name;
        public String title;
        public String url;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(FeatureCardCompetitionSubNode featureCardCompetitionSubNode) {
            super(featureCardCompetitionSubNode);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {featureCardCompetitionSubNode};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (featureCardCompetitionSubNode == null) {
                return;
            }
            this.title = featureCardCompetitionSubNode.title;
            this.url = featureCardCompetitionSubNode.url;
            this.competition_image = featureCardCompetitionSubNode.competition_image;
            this.team1_name = featureCardCompetitionSubNode.team1_name;
            this.team1_image = featureCardCompetitionSubNode.team1_image;
            this.team2_name = featureCardCompetitionSubNode.team2_name;
            this.team2_image = featureCardCompetitionSubNode.team2_image;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardCompetitionSubNode build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FeatureCardCompetitionSubNode(this, z, null) : (FeatureCardCompetitionSubNode) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ FeatureCardCompetitionSubNode(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureCardCompetitionSubNode(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            String str3 = builder.competition_image;
            if (str3 == null) {
                this.competition_image = "";
            } else {
                this.competition_image = str3;
            }
            String str4 = builder.team1_name;
            if (str4 == null) {
                this.team1_name = "";
            } else {
                this.team1_name = str4;
            }
            String str5 = builder.team1_image;
            if (str5 == null) {
                this.team1_image = "";
            } else {
                this.team1_image = str5;
            }
            String str6 = builder.team2_name;
            if (str6 == null) {
                this.team2_name = "";
            } else {
                this.team2_name = str6;
            }
            String str7 = builder.team2_image;
            if (str7 == null) {
                this.team2_image = "";
                return;
            } else {
                this.team2_image = str7;
                return;
            }
        }
        this.title = builder.title;
        this.url = builder.url;
        this.competition_image = builder.competition_image;
        this.team1_name = builder.team1_name;
        this.team1_image = builder.team1_image;
        this.team2_name = builder.team2_name;
        this.team2_image = builder.team2_image;
    }
}
