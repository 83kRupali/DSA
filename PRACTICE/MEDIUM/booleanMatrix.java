void booleanMatrix(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        boolean vis[][] = new boolean[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    vis[i][j] = true;
                }        
                else{
                    vis[i][j] = false;
                }
            }
        }
        
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j] == true){
                    for(int k=0; k<n; k++){
                        mat[i][k] = 1;
                    }
                    for(int k=0; k<m; k++){
                        mat[k][j] = 1;
                    }
                }
            }
        }
    }
